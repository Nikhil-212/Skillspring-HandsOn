BEGIN
    UPDATE employees SET salary = salary + 1000 WHERE department_id = 10;
    DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT || ' employee records updated');
END;
/
