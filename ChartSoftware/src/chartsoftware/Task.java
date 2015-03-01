/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartsoftware;

/**
 *
 * @author Matt
 */
public class Task {
    private String taskName;
    private int start;
    private int length;
    
    public Task(String taskName, int start, int length)
    {
    this.taskName = taskName;
    this.start = start;
    this.length = length;
    
    }
}
