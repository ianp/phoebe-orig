/*
 * Copyright © 2015, 8Kdata Technologies, S.L.
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


package com.eightkdata.phoebe.client.api;


import com.eightkdata.phoebe.client.StartupFlowHandler;
import com.eightkdata.phoebe.common.PostgresEncoding;

import javax.annotation.Nonnull;
import java.nio.charset.Charset;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by ianp on 2015-08-03.
 */
public class StartupCommand implements StartupFlowHandler.Callback {
    private final String user;
    private final String password;
    private final String database;
    private final PostgresEncoding encoding;

    public StartupCommand(@Nonnull String username, String password, String database, @Nonnull PostgresEncoding encoding) {
        this.user = checkNotNull(username, "username");
        this.password = password;
        this.database = database;
        this.encoding = checkNotNull(encoding);
    }

    public StartupCommand(@Nonnull String username, String password, String database) {
        this(username, password, database, PostgresEncoding.UTF8);
    }

    public Charset getCharset() {
        return encoding.getCharset();
    }

    @Override
    public String getUsername() {
        return user;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getDatabase() {
        return database;
    }
}
