/*
 * Copyright (c) 2015, 8Kdata Technology S.L.
 *
 * Permission to use, copy, modify, and distribute this software and its documentation for any purpose,
 * without fee, and without a written agreement is hereby granted, provided that the above copyright notice and this
 * paragraph and the following two paragraphs appear in all copies.
 *
 * IN NO EVENT SHALL 8Kdata BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES,
 * INCLUDING LOST PROFITS, ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF 8Kdata HAS BEEN
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * 8Kdata SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE PROVIDED HEREUNDER IS ON AN "AS IS" BASIS,
 * AND 8Kdata HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 *
 */


package com.eightkdata.phoebe.common;

/**
 * Created: 25/07/15
 *
 * @author Álvaro Hernández Tortosa <aht@8kdata.com>
 */
public enum FeMessageType {
    Bind,
    CancelRequest,
    Close,
    CopyData,
    CopyDone,
    CopyFail,
    Describe,
    Execute,
    Flush,
    FunctionCall,
    Parse,
    PasswordMessage,
    Query,
    SSLRequest,
    StartupMessage,
    Sync,
    Terminate
    ;

    private final MessageType febeMessageType;

    FeMessageType() {
        this.febeMessageType = MessageType.valueOf(name());
    }

    public MessageType getFeBeMessageType() {
        return febeMessageType;
    }
}
