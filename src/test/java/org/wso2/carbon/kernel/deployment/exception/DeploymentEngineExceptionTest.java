/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.kernel.deployment.exception;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeploymentEngineExceptionTest {

    @Test
    public void testDeploymentEngineException() {
        try {
            throw new DeploymentEngineException("sample exception");
        } catch (DeploymentEngineException e) {
            String exceptionMessage = "sample exception";
            Assert.assertEquals(exceptionMessage, e.getMessage());
        }
    }

    @Test
    public void testDeploymentEngineExceptionWithThrowable() {
        try {
            RuntimeException exception = new RuntimeException();
            throw new DeploymentEngineException("sample exception", exception);
        } catch (DeploymentEngineException e) {
            Assert.assertTrue(e.getCause() instanceof RuntimeException);
        }
    }
}
