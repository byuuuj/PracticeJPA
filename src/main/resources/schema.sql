CREATE TABLE IF NOT EXISTS MEMBER (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     `name` VARCHAR(50) NOT NULL,
                                     age BIGINT NOT NULL
);

-- 샘플 데이터 삽입
INSERT INTO MEMBER (name, age) VALUES
                                        ('john_doe', 23),
                                        ('jane_smith', 44),
                                        ('mike_johnson', 22),
                                        ('emily_brown', 11),
                                        ('david_wilson', 13);
