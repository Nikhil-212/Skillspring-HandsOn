DECLARE
    number_value NUMBER := 1;
BEGIN
    WHILE number_value <= 5 LOOP
        DBMS_OUTPUT.PUT_LINE(number_value);
        number_value := number_value + 1;
    END LOOP;
END;
/
