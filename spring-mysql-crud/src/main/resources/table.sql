DROP TABLE IF EXISTS user;
CREATE TABLE user(user_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL
				, user_name VARCHAR(100)  NOT NULL
				, word_id INT NOT NULL
				, last_picked_date date default '1000-01-01' NOT NULL
				);
 
DROP TABLE IF EXISTS word;
CREATE TABLE word(word_id INT PRIMARY KEY AUTO_INCREMENT
			, word_phrase VARCHAR(25) NOT NULL
			, word_sentence VARCHAR(255) NOT NULL
);