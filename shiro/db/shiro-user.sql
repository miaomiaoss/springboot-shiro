/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : local

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 16/10/2019 18:11:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_permissions
-- ----------------------------
DROP TABLE IF EXISTS `t_permissions`;
CREATE TABLE `t_permissions`  (
  `id` bigint(11) NOT NULL COMMENT '主键',
  `per_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限名称',
  `per_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限代码',
  `create_user_id` bigint(11) NULL DEFAULT NULL COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_user_id` bigint(11) NULL DEFAULT NULL COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '备注信息',
  `version` int(11) NULL DEFAULT NULL COMMENT '版本',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '删除标志（0：正常；1：删除；）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_permissions
-- ----------------------------
INSERT INTO `t_permissions` VALUES (1184410232654983170, '查询', 'test.query', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_permissions` VALUES (1184410267543240706, '删除', 'test.delete', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_permissions` VALUES (1184410290628661250, '新增', 'test.add', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_permissions` VALUES (1184410314431270914, '修改', 'test.update', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `id` bigint(11) NOT NULL COMMENT '主键',
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `role_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色代码',
  `create_user_id` bigint(11) NULL DEFAULT NULL COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_user_id` bigint(11) NULL DEFAULT NULL COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '备注信息',
  `version` int(11) NULL DEFAULT NULL COMMENT '版本',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '删除标志（0：正常；1：删除；）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES (1184409467379007489, '超级管理员', 'role.superadmin', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role` VALUES (1184409731100114945, '管理员', 'role.admin', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_role_permissions
-- ----------------------------
DROP TABLE IF EXISTS `t_role_permissions`;
CREATE TABLE `t_role_permissions`  (
  `id` bigint(11) NOT NULL COMMENT '主键id',
  `role_id` bigint(11) NULL DEFAULT NULL COMMENT '角色id',
  `per_id` bigint(11) NULL DEFAULT NULL COMMENT '权限id',
  `create_user_id` bigint(11) NULL DEFAULT NULL COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_user_id` bigint(11) NULL DEFAULT NULL COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '备注信息',
  `version` int(11) NULL DEFAULT NULL COMMENT '版本',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '删除标志（0：正常；1：删除；）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role_permissions
-- ----------------------------
INSERT INTO `t_role_permissions` VALUES (1184410050932617218, 1184409467379007489, 1184410232654983170, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_permissions` VALUES (1184410111758389249, 1184409467379007489, 1184410267543240706, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_permissions` VALUES (1184410137784025090, 1184409467379007489, 1184410290628661250, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_permissions` VALUES (1184410161469308930, 1184409467379007489, 1184410314431270914, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` bigint(50) NOT NULL COMMENT '主键',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '盐值',
  `create_user_id` bigint(11) NULL DEFAULT NULL COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_user_id` bigint(11) NULL DEFAULT NULL COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '备注信息',
  `version` int(11) NULL DEFAULT NULL COMMENT '版本',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '删除标志（0：正常；1：删除；）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1184409394981232641, 'admin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role`  (
  `id` bigint(11) NOT NULL COMMENT '主键',
  `user_id` bigint(11) NULL DEFAULT NULL COMMENT '用户id',
  `role_id` bigint(11) NULL DEFAULT NULL COMMENT '角色id',
  `create_user_id` bigint(11) NULL DEFAULT NULL COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_user_id` bigint(11) NULL DEFAULT NULL COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '备注信息',
  `version` int(11) NULL DEFAULT NULL COMMENT '版本',
  `del_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '删除标志（0：正常；1：删除；）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES (1, 1184409394981232641, 1184409467379007489, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
