package com.cognizant.week2.junit.timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class SlowTaskTest { @Test void completesQuickly() { assertTimeout(Duration.ofSeconds(1), () -> assertEquals("Completed", new SlowTask().complete())); } }
