/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.spi.task.dq.utils;

import org.apache.dolphinscheduler.spi.task.dq.model.JdbcInfo;

import org.junit.Assert;
import org.junit.Test;

/**
 * JdbcUrlParserTest
 */
public class JdbcUrlParserTest {

    @Test
    public void testGetJdbcInfo() {
        JdbcInfo jdbcInfo =
                JdbcUrlParser.getJdbcInfo("jdbc:mysql://localhost:3306/dolphinscheduler?"
                        + "useUnicode=true&characterEncoding=UTF-8");
        if (jdbcInfo != null) {
            String jdbcInfoStr = jdbcInfo.toString();
            String expected = "JdbcInfo{host='localhost', port='3306', "
                    + "driverName='mysql', database='dolphinscheduler', "
                    + "params='useUnicode=true&characterEncoding=UTF-8', "
                    + "address='jdbc:mysql://localhost:3306'}";
            Assert.assertEquals(expected,jdbcInfoStr);
        }
    }
}
