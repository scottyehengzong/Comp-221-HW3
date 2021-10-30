# Comp-221-HW3

Regular Expression of date formats

the "|" in the end of dateFormat{1,2,3,4} means to have the correct input of complie() method

dateFormat1 ="(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sept|Oct|Nov|Dec) (0[1-9]|[1-2][0-9]|3[0-1]|[1-9]), \\d{4}|"; 
dateFormat1 matches date in form of "Month Day, Year", allowing single_digit day
(0[1-9]|[1-2][0-9]|3[0-1]|[1-9]) means that the form "0 with a integer between 1 to 9" and a integer between 1 and 31 are allowed
for example, "May 14, 2020" "Jun 2, 2021"

dateFormat2 = "(0[1-9]|[1-2][0-9]|3[0-1]|[1-9]) (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sept|Oct|Nov|Dec), \\d{4}|";
dateFormat2 matches date in form of "Day Month, Year", allowing single-digit day
for example, "14 May, 2020" "2 Jun, 2022"

dateFormat3 = "(0[1-9]|[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1]|[1-9])/([0-9][0-9]|)[0-9][0-9]|";
dateFormat3 matches date in forms of MM/DD/YYYY and MM/DD/YY, allowing single-digit month and day
for example, 05/14/2020, 05/14/20, 4/2/2020, 6/29/2022, 07/08/21

dateFormat4 = "\\d{4}[0-9][0-9]/(0[1-9]|[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1]|[1-9])|";
dateFormat4 matches date in form of YYYY/MM/DD, allowing signle-digit month and day
for example, 2020/05/14, 2023/5/6, 2023/12/3, 2022/02/02

dateFormat5 = "(0[1-9]|[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]|[1-9])-([0-9][0-9]|)[0-9][0-9]";
dateFormat5 matches date in forms of MM-DD-YYYY and MM-DD-YY, allowing single-digit month and day
for example, 05-14-2020, 05-14-20, 12-2-2021

 