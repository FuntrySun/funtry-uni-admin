package top.continew.admin.CommonUse.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serial;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 签到活动表
 * </p>
 *
 * @author weiwei
 * @since 2024-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("check_activity_info")
public class CheckActivityInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 签到活动ID，主键
     */
    @TableId(value = "check_in_id", type = IdType.AUTO)
    private Long checkInId;

    /**
     * 教师ID，外键
     */
    private Long teacherId;

    /**
     * 课程ID，外键
     */
    private Long courseId;

    /**
     * 签到开始时间
     */
    private LocalDateTime startTime;

    /**
     * 签到结束时间
     */
    private LocalDateTime endTime;

    /**
     * 签到状态，如激活或未激活
     */
    private Integer checkStatus;


}
