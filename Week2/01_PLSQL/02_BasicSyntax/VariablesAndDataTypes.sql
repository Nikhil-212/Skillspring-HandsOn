DECLARE
    student_name VARCHAR2(50) := 'Anita';
    marks NUMBER := 85;
    is_passed BOOLEAN := TRUE;
BEGIN
    DBMS_OUTPUT.PUT_LINE(student_name || ' scored ' || marks);
    IF is_passed THEN
        DBMS_OUTPUT.PUT_LINE('Passed');
    END IF;
END;
/
