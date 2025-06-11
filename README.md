AsyncReportAggregator

## Overview
Code is generating report by fetching data from two external services. The generateFullReport() method times out under load testing. Profiling shows most time is spent waiting for a synchronous external API call. You are required to refactor the code for asynchronous report generation by fetching data from two external services in parallel using `CompletableFuture`. The goal is to maintain 95th percentile latency under 300 ms under high load.


 
#### Steps to Reproduce
 
1. Compile with `mvn clean package`.
2. Run unit tests to observe failure using `mvn test`
3. Final objective is to make test case pass.
4. You can run test cases many times and refactor your code.
5. Make sure you push the code to git before the final submission using shortcut : Cntrl + Shift + B

## Key Concepts
- CompletableFuture
- thenCombine for parallel async composition
- Custom ThreadPool
- Timeout handling using `orTimeout`
