/*
--步驟一
declare mycur cursor for
select * from student
go
*/

/*
--步驟二
open mycur
go
*/

--步驟三
fetch next from mycur
go