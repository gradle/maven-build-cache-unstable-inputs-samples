package com.gradle.example.impl;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ImplTest {

    @Parameters
    public static File[] files() {
        return new File(System.getProperty("samplesDir")).listFiles();
    }

    @Parameter(0)
    public File sampleFile;

    @Test
    public void testTheAnswer() {
        assertEquals(42, new Impl().getTheAnswer());
    }

    @Test
    public void testTheSampleFileAnswers() throws Exception {
        List<String> lines = Files.readAllLines(sampleFile.toPath());
        assertEquals("42", lines.get(0));
    }
}
