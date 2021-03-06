/* 
 * Copyright 2016 xxlabaza.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.xxlabaza.test.hsqldb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author Artem Labazin
 * <p>
 * @since Jan 16, 2016 | 6:42:05 PM
 * <p>
 * @version 1.0.0
 */
@Data
@Entity
@Table(name = "[person]")
class Person implements Serializable {

    private static final long serialVersionUID = 716474930885091842L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "[id]")
    private Integer id;

    @Column(name = "[first_name]")
    private String firstName;

    @Column(name = "[last_name]")
    private String lastName;

    @Column(name = "[age]")
    private int age;
}
