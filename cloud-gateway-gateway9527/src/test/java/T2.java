import java.time.ZonedDateTime;

/**
 * @author wddlhyss
 * @PACKAGE_NAME: PACKAGE_NAME
 * @NAME: T2
 * @USER: LHY
 * @DATE: 2020/3/25
 * @TIME: 15:36
 * @YEAR: 2020
 * @MONTH: 03
 * @MONTH_NAME_SHORT: 3月
 * @MONTH_NAME_FULL: 三月
 * @DAY: 25
 * @DAY_NAME_SHORT: 周三
 * @DAY_NAME_FULL: 星期三
 * @HOUR: 15
 * @MINUTE: 36
 * @PROJECT_NAME: springcloudtext
 **/
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        //2020-03-25T15:37:28.375+08:00[Asia/Shanghai]

    }
}
