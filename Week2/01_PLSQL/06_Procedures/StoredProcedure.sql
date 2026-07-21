CREATE OR REPLACE PROCEDURE display_employee_count AS
    employee_count NUMBER;
BEGIN
    SELECT COUNT(*) INTO employee_count FROM employees;
    DBMS_OUTPUT.PUT_LINE('Employees: ' || employee_count);
END;
/

BEGIN
    display_employee_count;
END;
/
