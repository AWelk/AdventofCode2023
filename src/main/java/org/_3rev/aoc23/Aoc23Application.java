package org._3rev.aoc23;

import org._3rev.aoc23.core.PuzzleRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aoc23Application implements CommandLineRunner {

    private final PuzzleRunner runner;

    public Aoc23Application(final PuzzleRunner runner) {
        this.runner = runner;
    }

    public static void main(String[] args) {
        SpringApplication.run(Aoc23Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        runner.run();
    }
}
