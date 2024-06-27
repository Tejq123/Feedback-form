CREATE TABLE feedback_form (
                               id BIGINT AUTO_INCREMENT PRIMARY KEY,
                               name VARCHAR(100),
                               email VARCHAR(100),
                               rating INTEGER,
                               comments TEXT
);
