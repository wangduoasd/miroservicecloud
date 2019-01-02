package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wangduo
 * @date 2019/1/2 - 10:33
 */
@Data//默认有无参构造器（在加后续注解后默认空参消失）
@AllArgsConstructor//全参构造器
@NoArgsConstructor//无参构造器
@Accessors(chain = true)//使用链式创建:
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;
}
/*
class aa{
public static void main(String[]args){
        //使用@Accessors(chain = true)
        Dept userChain=new Dept();
        userChain.setDeptno (1L).setDname ("aa").setDb_source ("bb");//链式创建
        }
        }*/
