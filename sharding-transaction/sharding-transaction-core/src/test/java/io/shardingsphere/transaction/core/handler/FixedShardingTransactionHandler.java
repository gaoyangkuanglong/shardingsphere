/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.transaction.core.handler;

import io.shardingsphere.core.constant.DatabaseType;
import io.shardingsphere.transaction.api.TransactionType;
import io.shardingsphere.transaction.core.manager.ShardingTransactionManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Map;

import static org.mockito.Mockito.mock;

/**
 * Fixed sharding transaction handler.
 *
 * @author zhaojun
 */
public final class FixedShardingTransactionHandler extends ShardingTransactionHandlerAdapter {
    
    private ShardingTransactionManager shardingTransactionManager = mock(ShardingTransactionManager.class);
    
    @Override
    public ShardingTransactionManager getShardingTransactionManager() {
        return shardingTransactionManager;
    }
    
    @Override
    public TransactionType getTransactionType() {
        return null;
    }
    
    @Override
    public void registerTransactionalResource(final DatabaseType databaseType, final Map<String, DataSource> dataSourceMap) {
    
    }
    
    @Override
    public void clearTransactionalResource() {
    
    }
    
    @Override
    public Connection createConnection(final String dataSourceName, final DataSource dataSource) {
        return null;
    }
}
