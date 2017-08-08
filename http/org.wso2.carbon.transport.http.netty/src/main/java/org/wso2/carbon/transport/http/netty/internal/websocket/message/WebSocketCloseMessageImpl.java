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

package org.wso2.carbon.transport.http.netty.internal.websocket.message;

import org.wso2.carbon.transport.http.netty.contract.websocket.WebSocketCloseMessage;
import org.wso2.carbon.transport.http.netty.internal.websocket.WebSocketChannelContextImpl;

/**
 * Implementation of {@link WebSocketCloseMessage}.
 */
public class WebSocketCloseMessageImpl extends WebSocketChannelContextImpl implements WebSocketCloseMessage {

    private final int closeCode;
    private final String closeReason;

    public WebSocketCloseMessageImpl(int closeCode, String closeReason, WebSocketChannelContextImpl channelContext) {
        super(channelContext.getServerSession(), channelContext.getChannelContext());
        this.closeCode = closeCode;
        this.closeReason = closeReason;
    }

    @Override
    public int getCloseCode() {
        return closeCode;
    }

    @Override
    public String getCloseReason() {
        return closeReason;
    }
}
