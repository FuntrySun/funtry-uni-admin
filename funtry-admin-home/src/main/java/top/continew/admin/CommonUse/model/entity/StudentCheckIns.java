package top.continew.admin.CommonUse.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 学生签到记录表
 * </p>
 *
 * @author weiwei
 * @since 2024-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("student_check_ins")
public class StudentCheckIns implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 签到记录ID，主键
     */
    @TableId(value = "record_id", type = IdType.AUTO)
    private Long recordId;

    /**
     * 学生ID，外键
     */
    private Long studentId;

    /**
     * 签到活动ID，外键
     */
    private Long checkInId;

    /**
     * 学生签到时间
     */
    private LocalDateTime checkInTime;


}
