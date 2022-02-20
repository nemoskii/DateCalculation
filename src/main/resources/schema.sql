CREATE TABLE IF NOT EXISTS dateformula( 
    dateId int(10) AUTO_INCREMENT NOT NULL,
     dateName varchar(30),
     calcYear int(2) NOT NULL DEFAULT 0,
     calcMonth int(2) NOT NULL DEFAULT 0,
     calcDay int(3) NOT NULL DEFAULT 0,
      PRIMARY KEY (dateId)
);
