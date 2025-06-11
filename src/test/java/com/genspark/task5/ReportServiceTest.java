package com.genspark.task5;

import static utils.TestUtils.businessTestFile;
import static utils.TestUtils.currentTest;
import static utils.TestUtils.yakshaAssert;

import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.Test;

class ReportServiceTest {

    @Test
    void testGenerateFullReport() throws Exception {
    	try {
        ReportService service = new ReportService();
        long start = System.nanoTime();
        CompletableFuture<String> future = service.generateFullReport("user42");
        String result = future.get(); // waits for completion
        long end = System.nanoTime();
        long durationMs = (end - start) / 1_000_000;
        System.out.println("Execution time: " + durationMs + " ms");
        yakshaAssert(currentTest(), durationMs < 350, businessTestFile);
    	}catch(Exception ex) {
    		yakshaAssert(currentTest(), false, businessTestFile);
    	}
    }
}