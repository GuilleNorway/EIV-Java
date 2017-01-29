package com.guillenorway.eiv.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdl.odata.controller.AbstractODataController;

@RestController
@RequestMapping("/guillenorway/eiv.svc/**")
public class ODataController extends AbstractODataController {

}
