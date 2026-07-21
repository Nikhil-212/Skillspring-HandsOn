CREATE OR REPLACE FUNCTION get_annual_salary(monthly_salary NUMBER)
RETURN NUMBER AS
BEGIN
    RETURN monthly_salary * 12;
END;
/

BEGIN
    DBMS_OUTPUT.PUT_LINE(get_annual_salary(5000));
END;
/
