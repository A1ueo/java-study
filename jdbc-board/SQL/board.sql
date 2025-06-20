-- 게시판 프로젝트 데이터베이스 생성
CREATE DATABASE jdbc_board;
USE jdbc_board;

-- 게시판 테이블 생성
CREATE TABLE board (
  no INTEGER AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL,
  writer VARCHAR(100) NOT NULL,
  content TEXT,
  reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  -- DATE 타입: reg_date DATE NOT NULL DEFAULT CURRENT_DATE
  upd_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  -- ON UPDATE CURRENT_TIMESTAMP: UPDATE 시 자동으로 수정 시간도 갱신
  PRIMARY KEY (no)
);

DESC board;

-- 추가
INSERT INTO board (title, writer, content)
VALUE
  ('게시글 제목1', '홍길동', '집에 가고 싶다.');


INSERT INTO board (title, writer, content)
VALUES
  ('게시글 제목2', '철수', '안녕하세요.'), 
  ('게시글 제목3', '영희', '반갑습니다.');


SELECT * FROM board;
SELECT * FROM board WHERE no = 1;

-- 수정
UPDATE board
SET
  title = '게시글 제목 수정',
  content = '점심 뭐먹지'
  -- upd_date = now() -- ON UPDATE를 안 넣었다면
WHERE no = 1;


-- 삭제
DELETE FROM board
WHERE no = 1;

-- 댓글 테이블
CREATE TABLE comment (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  board_no INTEGER NOT NULL,
  commenter VARCHAR(50),
  comment TEXT,
  reg_date DATETIME DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (board_no) REFERENCES board(no) ON DELETE CASCADE
  -- ON DELETE CASCADE: 외래키(FK)에 설정하는 옵션으로
  -- 부모 테이블의 행이 삭제될 때, 해당 행을 참조하는 자식 테이블의 행들도 자동으로 삭제
  -- 예: board의 특정 게시글이 삭제되면 그 게시글에 달린 comment들도 자동으로 삭제
);
