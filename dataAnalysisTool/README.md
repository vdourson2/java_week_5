# Data Analysis Tool - REST API Tutorial

## Endpoint documentation

| Method | Endpoint                   | Parameters                                                                                          | Response                                                                                                                                  |
| ------ | -------------------------- | --------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| GET    | /monthly_total               | year (required), month (required), country (optional, default: "all"), commodity (optional, default: "all"), transport_mode (optional, default: "all"), measure (optional, default: "$")| Sum of both the export and import for a specified month of a specified year.                                                                                                                  |

## Briefing

* Type of challenge: **Project**
* Duration: **unknown**
* Team challenge: **solo**

### Learning Objectives
- Develop a RESTful API in Java.
- Implement endpoints for data analysis operations.
- Understand RESTful API design principles.

### Requirements
- Basic knowledge of Java programming.
- Familiarity with data analysis concepts.
- Completion of the Week 3 Data Analysis Tool.

### The Mission

In this tutorial, you will convert the data analysis tool you created in Week 3 into a powerful RESTful API. The goal is to create a data analysis service that allows users to perform various operations on a static data source. Throughout this tutorial, we will follow RESTful API design principles to ensure our API is well-structured and easy to use.

#### Endpoints

1. `GET /monthly_total`

   Returns the sum of both the export and import for a specified month of a specified year.

   Parameters:
   - `year` (required): The year for which the data is requested.
   - `month` (required): The month for which the data is requested.
   - `country` (optional, default: "all"): The specific country to filter data. If not provided, data from all countries will be considered.
   - `commodity` (optional, default: "all"): The specific commodity to filter data. If not provided, data for all commodities will be considered.
   - `transport_mode` (optional, default: "all"): The specific transportation mode to filter data. If not provided, data from all transportation modes will be considered.
   - `measure` (optional, default: "$"): The measure to use for the calculation. If not provided, the default measure "$" will be used.

2. `GET /monthly_average`

   Returns the average of both the export and import for a specified month of a specified year.

   Parameters:
   - `year` (required): The year for which the data is requested.
   - `month` (required): The month for which the data is requested.
   - `country` (optional, default: "all"): The specific country to filter data. If not provided, data from all countries will be considered.
   - `commodity` (optional, default: "all"): The specific commodity to filter data. If not provided, data for all commodities will be considered.
   - `transport_mode` (optional, default: "all"): The specific transportation mode to filter data. If not provided, data from all transportation modes will be considered.
   - `measure` (optional, default: "$"): The measure to use for the calculation. If not provided, the default measure "$" will be used.

3. `GET /yearly_total`

   Provides an overview of all the monthly totals for a particular year. This endpoint returns the total of each month for both import and export and then gives the yearly total for both import and export.

   Parameters:
   - `year` (required): The year for which the data is requested.
   - `country` (optional, default: "all"): The specific country to filter data. If not provided, data from all countries will be considered.
   - `commodity` (optional, default: "all"): The specific commodity to filter data. If not provided, data for all commodities will be considered.
   - `transport_mode` (optional, default: "all"): The specific transportation mode to filter data. If not provided, data from all transportation modes will be considered.
   - `measure` (optional, default: "$"): The measure to use for the calculation. If not provided, the default measure "$" will be used.

4. `GET /yearly_average`

   Provides an overview of all the monthly averages for a particular year, for both import and export. Then it gives the yearly average for both import and export.

   Parameters:
   - `year` (required): The year for which the data is requested.
   - `country` (optional, default: "all"): The specific country to filter data. If not provided, data from all countries will be considered.
   - `commodity` (optional, default: "all"): The specific commodity to filter data. If not provided, data for all commodities will be considered.
   - `transport_mode` (optional, default: "all"): The specific transportation mode to filter data. If not provided, data from all transportation modes will be considered.
   - `measure` (optional, default: "$"): The measure to use for the calculation. If not provided, the default measure "$" will be used.

5. `GET /overview`

   Returns all the unique values that span the data set: years, countries, commodities, transportation modes, and measures.
