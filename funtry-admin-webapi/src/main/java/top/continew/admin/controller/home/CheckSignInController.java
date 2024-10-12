package top.continew.admin.controller.home;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.continew.admin.CommonUse.service.ICheckActivityInfoService;
import top.continew.starter.web.model.R;

/**
 * <p>
 *  小程序前端的扫码签到功能
 * </p>
 *
 * @author weiwei
 * @since 2024-10-11
 */
@Slf4j
@RestController
@RequestMapping("/sign-in")
public class CheckSignInController {
    // TODO: 实现扫码签到功能
    @Autowired
    private  ICheckActivityInfoService checkActivityInfoService;

    /*
    * 创建签到码*/
    @PostMapping("/createCode")
    public String createCode() {
        return "success";
    }
    @PostMapping("/checkCode")
    public R checkCode(@RequestParam("code") String code) {
        // 将拿到的code与数据库中的code进行比对，如果相同则签到成功，否则失败
        try {
            if(code.isEmpty()){
                return R.fail(String.valueOf(300),"code不能为空");
            }

        } catch (Exception e) {
            log.error("checkCode error", e);
        }
        return R.ok();
    }

}
