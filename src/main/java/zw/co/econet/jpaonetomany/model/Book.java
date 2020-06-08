package zw.co.econet.jpaonetomany.model;

import javax.persistence.*;

    @Entity
    public class Book {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;

        @ManyToOne
        @JoinColumn(name = "student_id", referencedColumnName = "student_id")
        private Student student;

        // ... getters and setters


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student getStudent() {
            return student;
        }

        public void setStudent(Student student) {
            this.student = student;
        }
    }
