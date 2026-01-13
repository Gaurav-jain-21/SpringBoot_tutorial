package com.project.Application.controllers;

import com.project.Application.entity.JounalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long, JounalEntry> journalEntries=new HashMap<>();
    @GetMapping
    public List<JounalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public boolean createEntry(@RequestBody JounalEntry myEntry){
        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }
    @GetMapping("id/{myId}")
    public JounalEntry getJournalEntryById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }
    @DeleteMapping("id/{myId}")
    public JounalEntry deleteJournalEntryById(@PathVariable Long myId){
        return journalEntries.remove(myId);
    }
    @PutMapping("/id/{id}")
    public JounalEntry updateJournalById(@PathVariable Long id, @RequestBody JounalEntry myEntry){
        return journalEntries.put(id,myEntry);
    }
}
