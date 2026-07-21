DECLARE
    CURSOR employee_cursor IS SELECT employee_id, first_name FROM employees;
    employee_id_value employees.employee_id%TYPE;
    first_name_value employees.first_name%TYPE;
BEGIN
    OPEN employee_cursor;
    LOOP
        FETCH employee_cursor INTO employee_id_value, first_name_value;
        EXIT WHEN employee_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(employee_id_value || ' ' || first_name_value);
    END LOOP;
    CLOSE employee_cursor;
END;
/
