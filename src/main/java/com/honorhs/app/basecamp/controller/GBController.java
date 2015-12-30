package com.honorhs.app.basecamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.honorhs.app.basecamp.service.GBService;
import com.honorhs.app.basecamp.model.GB;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

 
@Controller
public class GBController {
     
    @Autowired
    GBService GBService;
     
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model,
    		@ModelAttribute("GB") GB gb) {
    	if(gb!=null){
	    	if( (gb.getEmail()==null || gb.getId()==0) && gb.getsearch_flag()){
	    		model.addAttribute("GB", GBService.getGBList());
	    	}
	    	else if(!gb.getsearch_flag()){
	    		System.out.println("2");
	    		model.addAttribute("GB", GBService.getGBList());
	    		model.addAttribute("message", "찾는 내용이 없습니다");
	    	}
    	}
    	else{
    		model.addAttribute("GB", GBService.getGBList());
    		model.addAttribute("message", "비밀번호를 확인하세요");
    	}
        return "/GB/guest_book";
    }
    
    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public String add(@ModelAttribute("GB") GB gb,
            RedirectAttributes redirectAttributes) {

    	DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    	ZonedDateTime zonedDateTime = ZonedDateTime.now();
    	String formatter1 = dateTimeFormatter1.format(zonedDateTime);
    	gb.settime_stamp(formatter1);
    	try{
    		InternetAddress internetAddress = new InternetAddress(gb.getEmail());
    		internetAddress.validate();
    		redirectAttributes.addFlashAttribute("message", "추가되었습니다");
    		if(gb.getpassword().equals(gb.getpassword2())){
            	this.GBService.add(gb);   
    		}
    		else
    			redirectAttributes.addFlashAttribute("message", "비밀번호를 확인하세요");
    	}catch (AddressException e) {
    		redirectAttributes.addFlashAttribute("message", "이메일 형식 오류");
    	}
        return "redirect:/";
    }
     
    @RequestMapping(value = "/m_list", method = RequestMethod.GET)
    public String Mylist(@ModelAttribute("GB") GB gb,
            RedirectAttributes redirectAttributes, Model model) {
    	System.out.println(gb.getpassword());
    	redirectAttributes.addFlashAttribute("GB", this.GBService.m_list(gb) );     
        return "redirect:/";
    }
    
    @RequestMapping(value = "/search_bar", method = RequestMethod.GET)
    public String search(@ModelAttribute("GB") GB gb,
            RedirectAttributes redirectAttributes, Model model) {
    	List<GB> check = this.GBService.search_bar(gb);
    	if(check.isEmpty()){
    		GB check2 = new GB();
    		check2.setsearch_flag(false);
    		System.out.println("1");
    		redirectAttributes.addFlashAttribute("GB", check2);
    	}
    	else{
    		redirectAttributes.addFlashAttribute("GB", this.GBService.search_bar(gb) );
    	}    	     
        return "redirect:/";
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@ModelAttribute("GB") GB gb,
            RedirectAttributes redirectAttributes, Model model) {
    	
    	if(this.GBService.delete(gb)==0){
    		redirectAttributes.addFlashAttribute("message", "비밀번호를 확인하세요");
    	}
    	else{
    		redirectAttributes.addFlashAttribute("message", "삭제되었습니다");
    	}
          
        return "redirect:/";
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(@ModelAttribute("GB") GB gb,
            RedirectAttributes redirectAttributes, Model model) {
    	DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    	ZonedDateTime zonedDateTime = ZonedDateTime.now();
    	String formatter1 = dateTimeFormatter1.format(zonedDateTime);
    	gb.settime_stamp(formatter1);
    	System.out.println(this.GBService.update(gb));
    	if(this.GBService.update(gb)==0){
    		redirectAttributes.addFlashAttribute("message", "비밀번호 오류");
    	}
    	else{
    		redirectAttributes.addFlashAttribute("message", "수정 성공");
    	}
        return "redirect:/";
    }
    
}