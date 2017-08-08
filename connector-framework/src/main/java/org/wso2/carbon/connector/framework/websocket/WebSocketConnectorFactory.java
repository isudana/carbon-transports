/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.connector.framework.websocket;

import org.wso2.carbon.messaging.exceptions.ServerConnectorException;

import java.util.Map;
import java.util.Properties;
import javax.websocket.Session;

/**
 * WebSocket connector factory. All the connectors are produces through this interface.
 */
public interface WebSocketConnectorFactory {

    /**
     * Retrieve server connector.
     *
     * @param properties properties needed to create server connector.
     * @return WebSocketObserver for server connector.
     */
    WebSocketObservable getServerConnector(Map<String, String> properties) throws ServerConnectorException;

    /**
     * Create initial connection for remote server and return the {@link Session} for the connection.
     *
     * @param properties properties to create initial connection for the remote server.
     * @return the {@link Session} for the remote server connection.
     */
    Session getClientConnector(String remoteURL, WebSocketObserver observer, Properties properties);

}
