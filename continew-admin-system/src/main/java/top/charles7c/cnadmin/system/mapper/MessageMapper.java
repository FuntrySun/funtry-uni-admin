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

package top.charles7c.cnadmin.system.mapper;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;

import top.charles7c.cnadmin.common.base.BaseMapper;
import top.charles7c.cnadmin.system.model.entity.MessageDO;
import top.charles7c.cnadmin.system.model.vo.MessageVO;

/**
 * 消息 Mapper
 *
 * @author BULL_BCLS
 * @since 2023/10/15 19:05
 */
public interface MessageMapper extends BaseMapper<MessageDO> {

    /**
     * 分页查询列表
     *
     * @param page
     *            分页查询条件
     * @param queryWrapper
     *            查询条件
     * @return 分页信息
     */
    IPage<MessageVO> selectVoPage(@Param("page") IPage<Object> page,
        @Param(Constants.WRAPPER) QueryWrapper<MessageDO> queryWrapper);
}