DECLARE
    invalid_marks EXCEPTION;
    marks NUMBER := 120;
BEGIN
    IF marks < 0 OR marks > 100 THEN
        RAISE invalid_marks;
    END IF;
EXCEPTION
    WHEN invalid_marks THEN
        DBMS_OUTPUT.PUT_LINE('Marks must be between 0 and 100');
END;
/
