/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.main;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class TimerLogMainTest {

    // private static final String NATIVE_ENABLED = System.getProperty("quarkus.native.enabled");

    // @Test
    // public void testTimerLogMain() throws IOException {
    // QuarkusRunnerExecutor quarkusProcessExecutor = new QuarkusRunnerExecutor();
    // StartedProcess process = quarkusProcessExecutor.start();

    // awaitStartup(quarkusProcessExecutor);

    // try {
    // File quarkusLogFile = getQuarkusLogFile();
    // await().atMost(10L, TimeUnit.SECONDS).pollDelay(1, TimeUnit.SECONDS).until(() -> {
    // String log = FileUtils.readFileToString(quarkusLogFile, StandardCharsets.UTF_8);
    // return log.contains("Greetings");
    // });
    // } finally {
    // if (process != null && process.getProcess().isAlive()) {
    // process.getProcess().destroy();
    // }
    // }
    // }

    // private File getQuarkusLogFile() {
    // String pathPrefix = "target/quarkus";
    // if (isNative()) {
    // pathPrefix += "-native";
    // }
    // return new File(pathPrefix + ".log");
    // }

    // private void awaitStartup(QuarkusProcessExecutor quarkusProcessExecutor) {
    // await().atMost(10, TimeUnit.SECONDS).pollDelay(1, TimeUnit.SECONDS).until(() -> {
    // return isApplicationHealthy(quarkusProcessExecutor.getHttpPort());
    // });
    // }

    // private boolean isApplicationHealthy(int port) {
    // try {
    // int status = RestAssured.given()
    // .port(port)
    // .get("/q/health")
    // .then()
    // .extract()
    // .statusCode();
    // return status == 200;
    // } catch (Exception e) {
    // return false;
    // }
    // }

    // private static boolean isNative() {
    // return NATIVE_ENABLED != null && NATIVE_ENABLED.equals("true");
    // }

    // static final class QuarkusRunnerExecutor extends QuarkusProcessExecutor {
    // @Override
    // protected List<String> command(String... args) {
    // List<String> command = super.command(args);
    // if (isNative()) {
    // command.add("-Dquarkus.log.file.path=target/quarkus-native.log");
    // } else {
    // command.add(1, "-Dquarkus.log.file.path=target/quarkus.log");
    // }
    // command.add("Greetings");
    // command.add("2");
    // return command;
    // }

    // }
}
