/*
Table: Weather

+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| recordDate    | date    |
| temperature   | int     |
+---------------+---------+
id is the column with unique values for this table.
There are no different rows with the same recordDate.
This table contains information about the temperature on a certain day.


Write a solution to find all dates' Id with higher temperatures compared to its previous dates (yesterday).

Return the result table in any order.
*/

select w2.id id
from weather w1
         join weather w2 on w2.recorddate = w1.recorddate + 1
where w1.temperature < w2.temperature