/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50629
Source Host           : localhost:3306
Source Database       : wang-dubbo

Target Server Type    : MYSQL
Target Server Version : 50629
File Encoding         : 65001

Date: 2018-07-26 11:58:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `bas_account`
-- ----------------------------
DROP TABLE IF EXISTS `bas_account`;
CREATE TABLE `bas_account` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `salt` varchar(20) DEFAULT NULL COMMENT '盐',
  `type` int(10) DEFAULT NULL COMMENT '账号类型',
  `status` int(10) NOT NULL COMMENT '账号状态：0、关闭，1、启用',
  `last_login_time` date DEFAULT NULL COMMENT '最后登陆时间',
  `fail_num` varchar(20) NOT NULL DEFAULT '0' COMMENT '连续登陆失败次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账号表';

-- ----------------------------
-- Records of bas_account
-- ----------------------------

-- ----------------------------
-- Table structure for `bas_account_role`
-- ----------------------------
DROP TABLE IF EXISTS `bas_account_role`;
CREATE TABLE `bas_account_role` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `account_id` int(10) NOT NULL COMMENT '账号id',
  `role_id` int(10) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账号角色表';

-- ----------------------------
-- Records of bas_account_role
-- ----------------------------

-- ----------------------------
-- Table structure for `bas_config`
-- ----------------------------
DROP TABLE IF EXISTS `bas_config`;
CREATE TABLE `bas_config` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `code` varchar(20) DEFAULT NULL,
  `value` varchar(20) DEFAULT NULL,
  `remark` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bas_config
-- ----------------------------

-- ----------------------------
-- Table structure for `bas_config_param`
-- ----------------------------
DROP TABLE IF EXISTS `bas_config_param`;
CREATE TABLE `bas_config_param` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  `code` varchar(20) DEFAULT NULL COMMENT '编码',
  `value` varchar(20) DEFAULT NULL COMMENT '值',
  `remark` varchar(20) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统配置表（不经常变动的系统配置）';

-- ----------------------------
-- Records of bas_config_param
-- ----------------------------

-- ----------------------------
-- Table structure for `bas_login_log`
-- ----------------------------
DROP TABLE IF EXISTS `bas_login_log`;
CREATE TABLE `bas_login_log` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(10) DEFAULT NULL COMMENT '用户id',
  `login_time` varchar(20) DEFAULT NULL COMMENT '登陆时间',
  `login_ip` varchar(20) DEFAULT NULL COMMENT '登陆ip',
  `login_status` tinyint(1) DEFAULT NULL COMMENT '登陆状态：0、失败，1、成功',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='登陆日志表';

-- ----------------------------
-- Records of bas_login_log
-- ----------------------------

-- ----------------------------
-- Table structure for `bas_menu`
-- ----------------------------
DROP TABLE IF EXISTS `bas_menu`;
CREATE TABLE `bas_menu` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(20) DEFAULT NULL COMMENT '菜单名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Records of bas_menu
-- ----------------------------

-- ----------------------------
-- Table structure for `bas_role`
-- ----------------------------
DROP TABLE IF EXISTS `bas_role`;
CREATE TABLE `bas_role` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) NOT NULL COMMENT '角色名称',
  `description` varchar(50) NOT NULL COMMENT '角色描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of bas_role
-- ----------------------------

-- ----------------------------
-- Table structure for `bas_role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `bas_role_menu`;
CREATE TABLE `bas_role_menu` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `role_id` int(10) DEFAULT NULL COMMENT '角色id',
  `menu_id` int(10) DEFAULT NULL COMMENT '菜单id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色菜单表';

-- ----------------------------
-- Records of bas_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for `bas_test`
-- ----------------------------
DROP TABLE IF EXISTS `bas_test`;
CREATE TABLE `bas_test` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bas_test
-- ----------------------------
INSERT INTO `bas_test` VALUES ('1', 'zhangsan', '123456', 'zhangsan@163.com');
INSERT INTO `bas_test` VALUES ('2', 'lisi', '12345678', 'lisi@126.com');

-- ----------------------------
-- Table structure for `bas_user`
-- ----------------------------
DROP TABLE IF EXISTS `bas_user`;
CREATE TABLE `bas_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `real_name` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `identity_card` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `sex` int(1) DEFAULT NULL COMMENT '性别：1、男，2、女',
  `native_place` varchar(20) DEFAULT NULL COMMENT '籍贯',
  `education` varchar(20) DEFAULT NULL COMMENT '学历',
  `marriage` varchar(20) DEFAULT NULL COMMENT '婚姻',
  `address` varchar(20) DEFAULT NULL COMMENT '地址',
  `type` int(1) DEFAULT NULL COMMENT '用户类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bas_user
-- ----------------------------
