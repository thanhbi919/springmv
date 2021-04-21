CREATE TABLE IF NOT EXISTS `spring`.`users`
(
    `email` VARCHAR
(
    45
) NOT NULL,
    `passWord` VARCHAR
(
    20
) NULL DEFAULT NULL,
    `phonenumber` VARCHAR
(
    10
) NULL DEFAULT NULL,
    PRIMARY KEY
(
    `email`
))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci
INSERT INTO `spring`.`users` (`email`, `passWord`, `phonenumber`) VALUES ('abv', 'hihihihih', '0309929211');
INSERT INTO `spring`.`users` (`email`, `passWord`, `phonenumber`) VALUES ('hailien2902@gmail.com', 'adsfasdgadg', '0209929211');
INSERT INTO `spring`.`users` (`email`, `passWord`, `phonenumber`) VALUES ('hoangduyvuong0901@gmail.com', 'agsdagasv', '0109929211');
INSERT INTO `spring`.`users` (`email`, `passWord`, `phonenumber`) VALUES ('nhattannguyen0205@gmail.com', '15446547', '0909922211');
INSERT INTO `spring`.`users` (`email`, `passWord`, `phonenumber`) VALUES ('thuongduy1089@gmail.com', '151253457', '0909929211');
INSERT INTO `spring`.`users` (`email`, `passWord`, `phonenumber`) VALUES ('tieuthien1201@gmail.com', '15134645', '0909929211');
