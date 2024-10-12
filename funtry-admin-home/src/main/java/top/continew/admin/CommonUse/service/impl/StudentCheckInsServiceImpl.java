package top.continew.admin.CommonUse.service.impl;

import top.continew.admin.CommonUse.model.entity.StudentCheckIns;
import top.continew.admin.CommonUse.mapper.StudentCheckInsMapper;
import top.continew.admin.CommonUse.service.IStudentCheckInsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生签到记录表 服务实现类
 * </p>
 *
 * @author weiwei
 * @since 2024-10-12
 */
@Service
public class StudentCheckInsServiceImpl extends ServiceImpl<StudentCheckInsMapper, StudentCheckIns> implements IStudentCheckInsService {

}
