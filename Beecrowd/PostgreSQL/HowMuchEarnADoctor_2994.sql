-- Problem: How much earn a Doctor?
-- ID: 2994

WITH c_hour_earns AS (VALUES(150))
SELECT
	doctors.name,
	ROUND(SUM((attendances.hours * (table c_hour_earns)) 
			  + (attendances.hours * (table c_hour_earns) * (work_shifts.bonus/100)))
		 , 1) AS salary
FROM doctors, attendances, work_shifts
WHERE doctors.id = attendances.id_doctor
    AND work_shifts.id = attendances.id_work_shift
GROUP BY doctors.name
ORDER BY salary DESC;
;
