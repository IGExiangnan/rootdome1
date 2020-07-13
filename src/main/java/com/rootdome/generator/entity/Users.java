package com.rootdome.generator.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author southwind123
 * @since 2020-06-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;
    @TableId(value = "userid")
    private Integer userid;
    private String pwd;
    private String username;
    private String phone;


    @Override
    protected Serializable pkVal() {
        return this.userid;
    }

}
