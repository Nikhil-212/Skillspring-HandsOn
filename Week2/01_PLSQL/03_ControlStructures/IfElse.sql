DECLARE
    marks NUMBER := 72;
BEGIN
    IF marks >= 40 THEN
        DBMS_OUTPUT.PUT_LINE('Pass');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Fail');
    END IF;
END;
/
