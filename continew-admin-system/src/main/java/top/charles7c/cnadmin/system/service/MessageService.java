/*
 * Copyright (c) 2022-present Charles7c Authors. All Rights Reserved.
 *
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
 */

package top.charles7c.cnadmin.system.service;

import java.util.List;

import top.charles7c.cnadmin.common.model.query.PageQuery;
import top.charles7c.cnadmin.common.model.vo.PageDataVO;
import top.charles7c.cnadmin.system.model.query.MessageQuery;
import top.charles7c.cnadmin.system.model.request.MessageRequest;
import top.charles7c.cnadmin.system.model.vo.MessageVO;

/**
 * 消息业务接口
 *
 * @author BULL_BCLS
 * @since 2023/10/15 19:05
 */
public interface MessageService {

    /**
     * 分页查询列表
     *
     * @param query
     *            查询条件
     * @param pageQuery
     *            分页查询条件
     * @return 分页列表信息
     */
    PageDataVO<MessageVO> page(MessageQuery query, PageQuery pageQuery);

    /**
     * 新增
     *
     * @param request
     *            消息
     * @param userIdList
     *            接收人列表
     */
    void add(MessageRequest request, List<Long> userIdList);

    /**
     * 删除
     *
     * @param ids
     *            ID 列表
     */
    void delete(List<Long> ids);
}