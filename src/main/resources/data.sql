delete from dateformula;
ALTER TABLE `dateformula` auto_increment = 1;
INSERT INTO dateformula (dateId,dateName, calcYear, calcMonth, CalcDay) values('1', '1年後', 1,0,0);
INSERT INTO dateformula (dateId, dateName, calcYear, calcMonth, CalcDay) values('2', '1月後', 0,1,0);
INSERT INTO dateformula (dateId, dateName, calcYear, calcMonth, CalcDay) values('3', '10日後', 0,0,10);