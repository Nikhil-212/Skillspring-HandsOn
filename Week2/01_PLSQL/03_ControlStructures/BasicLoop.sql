DECLARE
    number_value NUMBER := 1;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE(number_value);
        number_value := number_value + 1;
        EXIT WHEN number_value > 5;
    END LOOP;
END;
/
