package com.ctl.it.qa.OmniVueTests.user;

import com.ctl.it.qa.omnivue.tools.pages.common.OVActivationPage;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateAddressRange;
import com.ctl.it.qa.omnivue.tools.pages.common.OVCreateService_MEFEVC;
import com.ctl.it.qa.omnivue.tools.pages.common.OVLocationSearchPage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class OSIPScreenStepDefinition {
	
	@Steps
	UserSteps enduser;
	OVCreateAddressRange addressrangepage ;
	OVActivationPage actpage;
	OVCreateService_MEFEVC mefevccreatepage ;
	OVLocationSearchPage locationsearchpage=null ;
	
	@And("^I goto Activation Page$")
	
	public void I_goto_Activation_Page() throws Exception {
		
		enduser.click_activationTab();
		
	}
	@And("^I clicked on \"([^\"]*)\" tab$")
	public void clickonTab(String Acttab) throws Exception {
		enduser.click_Tab(Acttab);
		System.out.println(Acttab);
	    
	}


	@And("^I searched for ([^\"]*)$")
	public void i_searched_for_device(String field) throws Exception {
		System.out.println(field);
		enduser.fill_fields(field);
		//enduser.click_searchBtn();	    
	}
	
	@And("^I searched for \"([^\"]*)\"$") //Remove later
	public void i_searched_for_Advancedorder(String field) throws Exception {
		System.out.println(field+"Advaceorder");
		enduser.fill_fields(field);
		//enduser.click_searchBtn();	    
	}
	
	@And("^I clicked on search button for \"([^\"]*)\"$")
	public void i_clicked_on_search_button(String search_button) throws Exception 
	{
		enduser.click_searchBtn(search_button);
	}


	/* Not necessary-5/27/2016
	@And("^I clicked on search button$")
	public void i_clicked_on_search_button() throws Exception 
	{
		enduser.click_searchBtn();
	}
	*/
	@And("^I clicked on view icon of search result page$")
	public void i_clicked_on_view_icon_of_search_result_page() throws Exception {
		Thread.sleep(3000);
		enduser.select_viewBtn();
		Thread.sleep(10000);
	     
	}
	
	
	
	
	
	// SANJAY - Create Address Range
	
	@When("^I go to \"([^\"]*)\" create type$")
	public void i_go_to_create_type(String container) throws Throwable {

		System.out.println("Hi");
		
		//enduser.fill_fields_1();
		
		
		actpage.ddl_createType1.selectByVisibleText("Inventory");
		actpage.ddl_invntryTypeCreate.selectByVisibleText("Location");
		actpage.ddl_locationType.selectByVisibleText("Address Range");
		actpage.btn_LaunchAddressRangeCreateForm.click();
		
		//addressrangepage.btn_LaunchCreateForm.click();
		//addressrangepage.btn_CreateButtonLocation.click();
		System.out.println("-----------------");
	    
	}
	
	
	@When("^I fill all the mandatory fields$")
	public void i_fill_all_the_mandatory_fields() throws Throwable {

		enduser.fill_fields_1();
		
	    //throw new PendingException();
	}
	
	
	
	
	
	
	@When("^I click on Create button of Address range page$")
	public void i_click_on_Create_button_of_Address_range_page() throws Throwable {
		
		System.out.println("I am going to click on Create button !!!!");
		
		actpage.btn_CreateAddressRange.click();
		
		System.out.println("I clicked on Create button !!!!");
		Thread.sleep(5000);
		
		/*
		//Boolean addressRangeviewscreen = actpage.img_AddressRange360view.isDisplayed();
		//System.out.println(addressRangeviewscreen);
	//  Thread.sleep(2000);
		//actpage.icon_AddressRange360viewClose.click();
	   // throw new PendingException();
	    
	    */
	}
	
	
	@Then("^Address Range should get created successfully$")
	public void address_Range_should_get_created_successfully() throws Throwable {
		
		System.out.println("Navigation back to Create Form");
		Thread.sleep(2000);
		actpage.tab_Back_2_AddressRangeForm.click();
		Thread.sleep(5000);
		String capture_message = actpage.txt_success_message_AddressRangeForm.getText();
		Thread.sleep(5000);
		System.out.println(capture_message);
		
		/*
		//actpage.tab_LaunchCreateForm.click();
		//Thread.sleep(5000);
		//String Address_Range_create_form_message = actpage.txt_Location_range_success_message.getText();
		//System.out.println(Address_Range_create_form_message);
				
	    //throw new PendingException();
	     
	     */
	}
	
	// End of Create Address Range

	
	
	
	// Steps related to Individual location Create form
	
	
	@When("^I go to \"([^\"]*)\" create type and select \"([^\"]*)\"$")
	public void i_go_to_create_type_and_select(String arg1, String arg2) throws Throwable {
	   
		actpage.ddl_createType1.selectByVisibleText("Inventory");
		actpage.ddl_invntryTypeCreate.selectByVisibleText("Location");
		actpage.ddl_locationType.selectByVisibleText("Individual Location");
		actpage.btn_LaunchAddressRangeCreateForm.click();
		Thread.sleep(5000);
		// Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
	
	
	@When("^I select \"([^\"]*)\" and search for \"([^\"]*)\"$")
	public void i_select_and_search_for(String arg1, String arg2) throws Throwable {
	    
		actpage.rdb_Add_To_Range.click();
		
		//enduser.fill_fields_1();
		
		
		addressrangepage.tbx_low_street.sendKeys("120");
		addressrangepage.tbx_high_street.sendKeys("130");
		addressrangepage.tbx_street_name.sendKeys("TEST AUTO - 1");
		addressrangepage.ddl_State.selectByVisibleText("LA-Louisiana");
		Thread.sleep(5000);
		addressrangepage.ddl_City.selectByVisibleText("BASILE");
		actpage.btn_Find_Address_Range.click();
		Thread.sleep(5000);
		actpage.ddl_Address_Range_value.selectByValue("1");
		
		/*
		String AddressRangeval = actpage.ddl_Address_Range_value.getText();
		System.out.println(AddressRangeval);
		if (AddressRangeval.trim() != "120-130 TEST AUTO - 1"){
			
			actpage.ddl_Address_Range_value.selectByValue("120-130 TEST AUTO - 1");
		}
		
		else
		{
			System.out.println("Address Range NOT FOUND IN THE DROP-DOWN");
		}
		
		*/
		
		
		//if (actpage.ddl_Address_Range_value.containsSelectOption("120-130 TEST AUTO - 1"))
			
			
			
		// Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
	
	
	@And("^I enter the PrimaryAddress")
	public void i_enter_addresses1() throws Throwable{
		actpage.cmb_Location_Role.selectByValue("1");
		actpage.tbx_Address_Number.sendKeys("121");	
	}
	
	
	@And("^I enter the \"([^\"]*)\" section details$")
	public void I_enter_the_Primary_Address_section_details (String arg1) throws Throwable {
		
		
		Boolean zip2 = actpage.tbx_Zip_2.isCurrentlyEnabled() ;
		System.out.println("Is Secondary Zip text-box enabled = " + zip2);
		
		enduser.fill_fields(arg1);
		

		System.out.println("Seconday Zip text value = " + actpage.tbx_Zip_2.getValue());
		
		actpage.cmb_Location_Role.selectByVisibleText("Building Site") ;
		actpage.cmb_Location_Role.selectByVisibleText("Customer Site") ;
		
		
	}
	
	
	@And("^I enter the \"([^\"]*)\" secoundaryaddress$")
	public void i_enter_addresses2(String arg1) throws Throwable{
		
		enduser.fill_fields(arg1);

	}
	
		
	
	
	@When("^I click on Create button in Individual Address page$")
	public void i_click_on_Create_button_in_Individual_Address_page() throws Throwable {
	    
		Boolean Create_button = actpage.btn_Individual_Location.isCurrentlyVisible();
		
		System.out.println("Create button visibility status = "+ Create_button);
		
		actpage.btn_Individual_Location.click();
	    //throw new PendingException();
	}
	
	
	
	@Then("^Individual Location should get created successfully$")
	public void Individual_Location_should_get_created_successfully () throws Throwable{
		
Thread.sleep(5000);
		
		Boolean ana_display =actpage.btn_Add_Next_Address.isDisplayed();
		Boolean btn_enabled = actpage.btn_Add_Next_Address.isEnabled();
		
		if (actpage.btn_Add_Next_Address.isDisplayed() == true){
			
			System.out.println("The Add Next Address Button is DISPLAYED = "+ ana_display);
			
			}	
		
			else {
			
			System.out.println("The Add Next Address Button is DISABLED = "+ ana_display);
			
			}
		
	
		if (actpage.btn_Add_Next_Address.isEnabled() == true){
			
			System.out.println("The Add Next Address Button is DISPLAYED = "+ ana_display);
			
			}	
		
			else {
			
			System.out.println("The Add Next Address Button is DISABLED = "+ ana_display);
			
				}
	
	
		actpage.tab_Individual_location_Create_form.click();
		Thread.sleep(2000);
		
		String message = actpage.txt_Individual_location_Create_form.getText();
		
		System.out.println(message);
	
	}
	
	
	
	
	
	@Then("^Location should get created successfully$")
	public void location_should_get_created_successfully() throws Throwable {

		Thread.sleep(5000);
		
		Boolean ana_display =actpage.btn_Add_Next_Address.isDisplayed();
		Boolean btn_enabled = actpage.btn_Add_Next_Address.isEnabled();
		Boolean label_Add_Range_ID =actpage.lbl_Address_Range_ID.isDisplayed();
		
		
		if(ana_display = true ){
			System.out.println("The Add Next Address Button is DISPLAYED = "+ ana_display);
			
			if (btn_enabled = true){
				
				System.out.println("The Add Next Address Button is ENABLED = " + btn_enabled);
				
				if (label_Add_Range_ID = true){
					
					System.out.println("The Add Next Address Button is DISPLAYED = " + label_Add_Range_ID );
					
				}
				else {
					
					System.out.println("The Add Next Address Button is NOT DISPLAYED");
					
				}
			}
			
			else
			{
				System.out.println("The Add Next Address Button is DISABLED = "+ btn_enabled);
			}
		}
		
		else
		{
			System.out.println("The Add Next Address Button is not DISPLAYED = " + ana_display);	
		
		}
		
		/*
		Boolean label_Add_Range_ID =actpage.lbl_Address_Range_ID.isDisplayed();
		
		if (label_Add_Range_ID = true){
			
			System.out.println("The Add Next Address Button is DISPLAYED");
			
		}
		else {
			
			System.out.println("The Add Next Address Button is NOT DISPLAYED");
			
		}
		*/
		
		actpage.tab_Individual_location_Create_form.click();
		Thread.sleep(2000);
		
		String message = actpage.txt_Individual_location_Create_form.getText();
		
		System.out.println(message);
	    //throw new PendingException();
	}
	
	
	
	// End of Steps related to Individual location Create form
	
	
	// MEF EVC Service 
	
	
	@And("^I go to \"([^\"]*)\" create type and select \"([^\"]*)\" as service type$")
	public void i_go_to_create_type_and_select_as_service_type(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		enduser.fill_fields(arg2);
		
		/*
		//actpage.ddl_createType1.selectByVisibleText("Inventory");
		//actpage.ddl_invntryTypeCreate.selectByVisibleText("Service");
		//System.out.println("Selected Inventory type as Service");
		*/
	}

	@And("^I select service type as \"([^\"]*)\" and launch the create form$")
	public void i_select_service_type_as_and_launch_the_create_form(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//actpage.ddl_ServiceType.selectByVisibleText("MEF EVC");
		
		
		actpage.btn_LaunchAddressRangeCreateForm.click();
		Thread.sleep(5000);
		if (actpage.txt_Create_MEF_EVC_Tab_title.isDisplayed()){
			
			System.out.println("MEF EVC Create form is launched");
			
		}
		else {
			System.out.println("MEF EVC Create form is Not launched");
		}
		
		
	}
	
	
	
	@And("^I fill all the mandatory fields required for \"([^\"]*)\"$")
	public void i_fill_all_the_mandatory_fields_required_for( String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		Thread.sleep(3000);
		enduser.fill_fields_service(arg1);
		
		mefevccreatepage.img_subscriberlookupicon.click();
		mefevccreatepage.tbx_subcriber_name_window.sendKeys("TEST - JANET");
		mefevccreatepage.btn_lookup.click();
		
		Thread.sleep(5000);
		
		mefevccreatepage.lnk_subcribername.click();
		
		String subscriber_name = mefevccreatepage.tbx_subscribername.getTextValue();
		System.out.println("successfully selected the Subscriber = "+ subscriber_name);
		
		
		
		//mefevccreatepage.tbx_provisionstatus.isEnabled() ;
		System.out.println("Checking Provision status field is enabled = " + mefevccreatepage.tbx_provisionstatus.isEnabled());
		
		
		// If loop used for MEF EVC Page
		
		//String evcmeetpt = mefevccreatepage.ddl_ismeetpointevc.getText();
		if (mefevccreatepage.ddl_ismeetpointevc.isCurrentlyVisible()){
			
			String evcmeetpt = mefevccreatepage.ddl_ismeetpointevc.getText();
			System.out.println("Is Meet Point EVC value is = " + mefevccreatepage.ddl_ismeetpointevc.getText());
		
		}
		
		
		
		// data related to host service
		
		if (mefevccreatepage.cbx_HOSTIPVERSION.isCurrentlyVisible() && mefevccreatepage.cbx_NWPROTOCOLTYPE.isDisplayed() && mefevccreatepage.cbx_SERVICECAPABILITY.isDisplayed() ){
		mefevccreatepage.cbx_HOSTIPVERSION.selectByVisibleText("Both");
		mefevccreatepage.cbx_NWPROTOCOLTYPE.selectByVisibleText("DHCP");
		mefevccreatepage.cbx_SERVICECAPABILITY.selectByVisibleText("IPTV-DATA");
		
		}
		
		
		
		// End of data related to host service
		
		
		
	}
	
	@And("^I click on manual activation checkbox$")
	public void I_click_on_manual_activation_checkbox () throws Throwable {
		
		mefevccreatepage.cbx_manualtask.click();
		System.out.println("Selected the manual checkbox");
		
	}
	
	
	
	
	
	@When("^I click on Create button of MEF EVC page$")
	public void i_click_on_Create_button_of_MEF_EVC_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Click on Create Button");
		
		mefevccreatepage.btn_create.click();
		Thread.sleep(5000);
		//actpage.btn_Individual_Location.click();
		
	}
	
	
	@Then("^Service should get created successfully$")
	public void service_should_get_created_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		//System.out.println("Service created successfully");
		
		Thread.sleep(5000);
		mefevccreatepage.tab_createserviceform.click();
		String tabname = mefevccreatepage.tab_createserviceform.getText();
		System.out.println(tabname);
		
		//System.out.println(mefevccreatepage.tab_createserviceform.getText());
		Thread.sleep(3000);
		
		
		String txt = mefevccreatepage.txt_message.getText();
		System.out.println(txt.trim());
		Thread.sleep(3000);
		mefevccreatepage.tab_service360view.click();
		System.out.println(mefevccreatepage.tab_service360view.getText());
		
		
	}

	
	
	@And("^Task should be generated and displayed in related tab Tasks$")
	public void task_should_be_generated_and_displayed_in_related_tab_Tasks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		Thread.sleep(5000);
		mefevccreatepage.tab_Tasksrelatedtab.click();
		System.out.println("Clicked on related tab = "+ mefevccreatepage.tab_Tasksrelatedtab.getText());
		Thread.sleep(13000);
		System.out.println("Task id generated  = " + mefevccreatepage.txt_taskid.getText());
		
		
		
		/*
		Boolean message = mefevccreatepage.txt_norelatedtaskmessage.isDisplayed();
		System.out.println("Is Error message displayed = "+message);
		
		if (message == true){
			
			
			System.out.println("Task is not generated !!!");
		}
		else
		{
			//if (mefevccreatepage.txt_circuitid.isDisplayed()){
			//	System.out.println("Circuit id  = " + mefevccreatepage.txt_circuitid.getText());
			//	}
				if (mefevccreatepage.txt_taskid.isDisplayed()){
				Thread.sleep(5000);
				System.out.println("Task id  = " + mefevccreatepage.txt_taskid.getText());
				}
			
		}
		Thread.sleep(5000);
		/*
		if (mefevccreatepage.txt_circuitid.isDisplayed()){
		System.out.println("Circuit id  = " + mefevccreatepage.txt_circuitid.getText());
		}
		if (mefevccreatepage.txt_taskid.isDisplayed()){
		Thread.sleep(5000);
		System.out.println("Task id  = " + mefevccreatepage.txt_taskid.getText());
		}
		*/
		
	}
		
	
	
	
	// End of Service 
	
	
	
	// Host service
	
	@When("^I click on create button$")
	public void I_click_on_create_button() throws Throwable {
		
		mefevccreatepage.btn_create.click();
		
	}
	

	
	// End of HOST Service 
	
	
	// OVC Service
	

	@And("^I go to \"([^\"]*)\" create type and select \"([^\"]*)\" as the service type$")
		public void i_go_to_create_type_and_select_as_the_service_type(String arg1, String arg2) throws Throwable {
				// Write code here that turns the phrase above into concrete actions
				//throw new PendingException();
				//enduser.fill_fields(arg2);
				enduser.fill_fields(arg2); 
				actpage.btn_LaunchAddressRangeCreateForm.click();
				
	}
	
	@Then("^I launch the create form$")
	public void i_launch_the_create_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.out.println("Success");
	}
	
	// End of OVC service 
	

	
	// Start of Add Individual location
	
	
	@And ("^I go to \"([^\"]*)\" search type and select \"([^\"]*)\" as the inventory type$")
	public void I_go_to_Inventory_search_type_and_select_Location_as_the_inventory_type (String arg1 , String arg2) throws Throwable {
		
		enduser.fill_fields(arg2);
		
	}
	
	
	
	@And ("^I click on Advanced search link$")
	public void I_click_on_Advanced_search_link () throws Throwable {
		
		
		actpage.lnk_Advanced_Search.click();
		
	}
	
	
	
	@And ("^I select Address Range radio button$")
	public void I_select_Address_Range_radio_button () throws Throwable{
		//Thread.sleep(5000);
		actpage.btn_AddressRange_radio_button.click();
		Thread.sleep(2000);
		
	}
	
	
	
	@And ("^I search for an \"([^\"]*)\"$")
	public void I_search_for_an_TC54068_Address_Range (String arg1) throws Throwable {

		enduser.fill_fields_locationsrch(arg1) ;
		Thread.sleep(2000);
		locationsearchpage.btn_Search.click();
		
		
	}
	
	
	@And("^I click on view icon$")
	public void I_click_on_view_icon () throws Throwable{
		
		System.out.println("Location Tab Title = " + locationsearchpage.txt_addressTabTtitle.getText());
		
		System.out.println("Is Add Individual Location visible = " + locationsearchpage.btn_AddIndividualLocation.isCurrentlyVisible());
		
		System.out.println("Is Add Individual Location Enabled = " + locationsearchpage.btn_AddIndividualLocation.isEnabled() );
		
		locationsearchpage.btn_AddIndividualLocation.click();
		
	}
	
	
	
	
	
	
	// End of Add Individual location
	
	
	
	
	
	@And("^I verified view page and clicked on \"([^\"]*)\" tab$")
	public void i_verified_view_page_of_device_and_clicked_on_services_tab(String tab) throws Exception {
		//enduser.verify_deviceSearchPage();
		System.out.println("entered the first stage"+tab);
		enduser.click_servicesTab(tab);
		
	}

	@And("^I searched for ([^\"]*) device$")
	public void i_searched_for_a_device(String container3) throws Throwable {
		enduser.fill_fields_from("OVActivationPage","US43123-TC24975",container3);
		enduser.get_container_from_xml("OVActivationPage","US43123-TC24975",container3);
		System.out.println(enduser.get_container_from_xml("OVActivationPage","US43123-TC24975",container3));
		//enduser.click_searchBtn();
	     
	}

	/*@And("^I need to search for \"([^\"]*)\"$")
	
	public void I_goto_Services_Page(String field) throws Exception {
		
		//Shifted 3 lines from I_goto_Activation_Page() down here
		//enduser.click_searchtab();
		System.out.println(field);
		enduser.fill_fields(field);
		
		enduser.click_searchbtn();
		enduser.select_viewbtn();
		enduser.verify_servicetab();
		enduser.click_servicestab();
		
	}
	*/
	@Then("^Validate the fields present in the result page$")
	public void attribute_validation(){
		enduser.attri_field();
	}
	
	@And("^I clicked on Advance Search for \"([^\"]*)\"$")//Need to remove this-Duplicate search
	public void i_clicked_on_Adcance_Search_for(String advanced_Search) throws Throwable {
	    enduser.click_searchBtn(advanced_Search);
	}

	@And("^I Search order with DTN$")
	public void i_search_order_with_DTN() throws Exception{
		enduser.advancesearch();
}
}
























