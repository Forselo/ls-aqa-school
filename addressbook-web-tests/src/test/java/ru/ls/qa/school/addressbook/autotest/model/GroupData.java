package ru.ls.qa.school.addressbook.autotest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GroupData {
    private String groupName;
    private String groupHeader;
    private String groupFooter;
}

